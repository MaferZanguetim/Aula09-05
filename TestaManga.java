public class TestaManga {

    public static void main(String[] args) {
        Manga manga = new Manga();
        manga.setFolhas("largas");
        manga.setPreco(7.00);
        manga.setTronco(1);
        manga.setFruto("fruto = manga");

        System.out.println(manga.getFolhas());
        System.out.println(manga.getPreco());
        System.out.println(manga.getTronco());
        System.out.println(manga.getFruto());
    }
}
    
