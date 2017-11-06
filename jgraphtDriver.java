
import java.util.List;

import org.jgrapht.*;
public class jgraphtDriver{
	public static void main (String args[])
	{
		Scanner scan = new Scanner(System.in);
		while (fileReader.hasNextLine())
		{
			String line = fileReader.nextLine();
       		System.out.println(line);
		}		
		DirectedGraph<String, DefaultEdge> graph = new DefaultDirectedGraph<String, DefaultEdge>(DefaultEdge.class);
		
	}
}