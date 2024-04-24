package JR;

public class PrincipalAluno {

	public static void main(String[] args) {
		Aluno A = new Aluno(null, 0, 0);
		A.setNome("Alguém");
		A.setNota1(7);
		A.setNota1(3);
		//A.setMedia(5, 7);
		System.out.println("A nota do aluno " +A.getNome() +" é " +A.getMedia());
	}

}
