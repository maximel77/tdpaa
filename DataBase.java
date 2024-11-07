import java.util.HashMap;
import java.util.Map;

public class Database {
    private String name;
    private Map<String, Relation> tables;  // Mapping table names to Relation objects

    // Constructor
    public Database(String name) {
        this.name = name;
        this.tables = new HashMap<>();
    }

    // Method to add a table to the database
    public void addTable(Relation table) {
        tables.put(table.getNom(), table);
    }

    // Method to get a table from the database by name
    public Relation getTable(String tableName) {
        return tables.get(tableName);
    }

    // Method to remove a table from the database by name
    public void removeTable(String tableName) {
        tables.remove(tableName);
    }

    // Method to list all tables in the database
    public void listTables() {
        if (tables.isEmpty()) {
            System.out.println("No tables in database " + name + ".");
        } else {
            System.out.println("Tables in database " + name + ":");
            for (Relation table : tables.values()) {
                System.out.println(" - " + table.getNom());
            }
        }
    }

    // Method to remove all tables from the database
    public void removeAllTables() {
        tables.clear();
    }

    // Get the name of the database
    public String getName() {
        return name;
    }
}
