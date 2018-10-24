package app;

//"top-level"
public class ClassesInternas {

	//classe interna(inner class)
	public class InnerClass{
	}
	
	public static class InnerClassStatic{
		
	}
	
	public static void main(String[] args) {
		// s� posso criar uma classe interna se a superior existir.
		ClassesInternas tipoDeClasses = new ClassesInternas();
		InnerClass innerClass = tipoDeClasses.new InnerClass();
		// classes static n�o obecem regra a ciam
		InnerClassStatic innerClassStatic = new InnerClassStatic();
	}
}
