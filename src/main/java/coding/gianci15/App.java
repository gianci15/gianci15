package coding.gianci15;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Hello world! in maven  comando : clean compile exec:java
 * y cambiar en pom Junit version 3.8 a 4.0 y añadir al pom  
  
 <build>
        <plugins>
            <plugin>
                <groupId>org.codehaus.mojo</groupId>
                <artifactId>exec-maven-plugin</artifactId>
                 <executions>
                    <execution>
                        <goals>
                            <goal>java</goal>
                        </goals>
                    </execution>
                </executions>
                <configuration>
                    <mainClass>coding.gianci15.App</mainClass>
                    <arguments>
                        <argument>Andrés</argument>
                    </arguments>
                </configuration>
            </plugin>
        </plugins>
    </build>
 *
 */
public class App 
{
	 public static void main( String[] args )
	    {
	       System.out.print("\n¡¡¡ Hello Word !!!\n\n");
/*	       	       
		   int a,b;
	 
	       Scanner scanIn = new Scanner(System.in);
	       System.out.println("Ingrese El primer Numero : ");
	       a =Integer.parseInt(scanIn.nextLine());
	 	  	
	       System.out.println("Ingrese El Segundo Numero : ");
	 	   b =Integer.parseInt(scanIn.nextLine());
	 	   scanIn.close();
	 	   
	       System.out.println("El resultado de la sume es :"+suma(a,b));
*/
 
	    }

	private static int suma(int a, int b) {

		return (a+b);
	}

	public String HolaMundo() {
		
		return "Hola Mundo";
	}

}
