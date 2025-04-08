package IntermediateLevel;

public class Uzumaki extends Ninja{

    public void chakraAumentado(){
        System.out.println("Sou um Uzumaki, portanto meu chakra é maior");
    }

    @Override // usar isso toda vez que eu quero fazer polimorfismo e quiser sobrescrever algum metodo
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + name + " e esse é meu ataque Uzumaki, Rasengan");
    }
}
