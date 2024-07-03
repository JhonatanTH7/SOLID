package Exercise4.Refactorized;

public class DataService {

    private final DataStorage dataStorage;

    public DataService() {
        this.dataStorage = new Database();
    }

    public void saveData(String data) {
        dataStorage.save(data);
    }

}
