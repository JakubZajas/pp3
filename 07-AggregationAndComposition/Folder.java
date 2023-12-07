import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<File> files;

    public void addFile(File file){
        files.add(file);
    }

    public void removeFile(File file){
        files.remove(file);
    }
    public ArrayList<String> listFiles() {
        ArrayList<String> fileNames = new ArrayList<>();
        for (File file : files) {
            fileNames.add(file.getName());
        }
        return fileNames;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    public Folder(String name, ArrayList<File> files) {
        this.name = name;
        this.files = new ArrayList<>();
    }

    
}