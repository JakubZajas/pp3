public class File {
    String name;
    int sizeInKb;

    public void rename(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSizeInKb() {
        return sizeInKb;
    }

    public void setSizeInKb(int sizeInKb) {
        this.sizeInKb = sizeInKb;
    }

    public File(String name, int sizeInKb) {
        this.name = name;
        this.sizeInKb = sizeInKb;
    }

    

}
