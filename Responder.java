import java.util.Random;
import java.util.ArrayList;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class Responder
{
    private Random generator;
    private ArrayList<String> responses;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        generator = new Random();
        responses = new ArrayList<>();
        fillResponses();
    }

    public void fillResponses()
    {
        responses.add("Please read the manual.");
        responses.add("Please call an expert.");
        responses.add("Please reboot.");
        responses.add("Unfortunately, this seems like a problem out of our expertise.");
        responses.add("That sounds interesting. Tell me more...");
    }
    
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        return responses.get(generator.nextInt(responses.size()));
    }
}

