package coding.gianci15;

import javax.swing.JOptionPane;

/**
 * Hello world! in maven  comando : clean compile exec:java
 * y cambiar en pom Junit version 3.8 a 4.0 y añadir al pom  
  
 <build>
        <plugins>
            <plugin>
                <groupId>org.codehaus.mojo</groupId>
                <artifactId>exec-maven-plugin</artifactId>
                <version>1.2.1</version>
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
 
	    }

	public String HolaMundo() {
		
		return "Hola Mundo";
	}

}
