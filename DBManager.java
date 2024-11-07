import java.io.*;
import java.util.*;

public class DBManager {
    private DBConfig dbConfig;
    private Map<String, Database> databases;
    private Database currentDatabase;

    public DBManager(DBConfig config) {
        this.dbConfig = config;
        this.databases = new HashMap<>();
    }

    public void CreateDatabase(String nomBdd) {
        if (!databases.containsKey(nomBdd)) {
            Database newDb = new Database(nomBdd);
            databases.put(nomBdd, newDb);
            System.out.println("Database created: " + nomBdd);
        } else {
            System.out.println("Database " + nomBdd + " already exists.");
        }
    }

    public void SetCurrentDatabase(String nomBdd) {
        Database db = databases.get(nomBdd);
        if (db != null) {
            this.currentDatabase = db;
            System.out.println("Current database set to: " + nomBdd);
        } else {
            System.out.println("Database " + nomBdd + " does not exist.");
        }
    }

    public void AddTableToCurrentDatabase(Relation table) {
        if (currentDatabase != null) {
            currentDatabase.addTable(table);
            System.out.println("Table added to database: " + table.getNom());
        } else {
            System.out.println("No active database.");
        }
    }

    public Relation GetTableFromCurrentDatabase(String nomTable) {
        if (currentDatabase != null) {
            return currentDatabase.getTable(nomTable);
        }
        System.out.println("No active database.");
        return null;
    }

    public void RemoveTableFromCurrentDatabase(String nomTable) {
        if (currentDatabase != null) {
            currentDatabase.removeTable(nomTable);
            System.out.println("Table " + nomTable + " removed.");
        } else {
            System.out.println("No active database.");
        }
    }

    public void RemoveDatabase(String nomBdd) {
        if (databases.containsKey(nomBdd)) {
            databases.remove(nomBdd);
            if (currentDatabase != null && currentDatabase.getName().equals(nomBdd)) {
                currentDatabase = null;
            }
            System.out.println("Database " + nomBdd + " removed.");
        } else {
            System.out.println("Database " + nomBdd + " does not exist.");
        }
    }

    public void RemoveTablesFromCurrentDatabase() {
        if (currentDatabase != null) {
            currentDatabase.clearTables();
            System.out.println("All tables removed from current database.");
        } else {
            System.out.println("No active database.");
        }
    }

    public void RemoveDatabases() {
        databases.clear();
        currentDatabase = null;
        System.out.println("All databases removed.");
    }

    public void ListDatabases() {
        System.out.println("Databases:");
        for (String dbName : databases.keySet()) {
            System.out.println(dbName);
        }
    }

    public void ListTablesInCurrentDatabase() {
        if (currentDatabase != null) {
            currentDatabase.listTables();
        } else {
            System.out.println("No active database.");
        }
    }

    public void SaveState() {
        try {
            File saveFile = new File(dbConfig.getDbpath(), "databases.save");
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(saveFile))) {
                oos.writeObject(databases);
                System.out.println("State saved.");
            }
        } catch (IOException e) {
            System.out.println("Error saving state: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public void LoadState() {
        File saveFile = new File(dbConfig.getDbpath(), "databases.save");
        if (saveFile.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(saveFile))) {
                databases = (Map<String, Database>) ois.readObject();
                System.out.println("State loaded.");
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error loading state: " + e.getMessage());
            }
        } else {
            System.out.println("No saved state found.");
        }
    }

    // Additional Database and Relation handling classes can be nested or created separately
}
