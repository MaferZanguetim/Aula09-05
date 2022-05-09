public class TestaCarro {
    public static void main(String[] args) {
        Carro carro=new Carro();
        carro.setMarca("Fiat");
        carro.setModelo("Pálio");
        carro.setPlaca("FDG 5613");
        carro.setRenavam(2359648);
        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getPlaca());
        System.out.println(carro.getRenavam());
    }
    
}
