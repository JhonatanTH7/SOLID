package Exercise4.Refactorized;

public class DataService {

    private DataStorage dataStorage;

    public DataService(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    public void saveData(String data) {
        dataStorage.save(data);
    }

}
