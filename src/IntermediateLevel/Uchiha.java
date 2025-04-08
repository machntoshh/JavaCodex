package IntermediateLevel;

public class Uchiha extends Ninja{
    // aprendendo herança

    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.println("Ativei minha habilidade " + habilidadeEspecial);
    }

    @Override // usar isso toda vez que eu quero fazer polimorfismo e quiser sobrescrever algum metodo
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + name + " e esse é meu ataque Uchiha, KATON");
    }

    public void sharinganAtivado() {

        System.out.println(name + " ativou o sharingan!!!");
    }
}
