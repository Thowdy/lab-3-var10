public class File extends AbstractDirectory {

    @Override
    public void filePath(String a){
        System.out.println(a);
    }

    @Override
    public void size(int a){
        System.out.println(a + "Кб");
    }

    public void fileExtension(String a){
        System.out.println(a);
    }
}
