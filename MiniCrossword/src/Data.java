import java.util.ArrayList;
import java.util.Collections;

public class Data
  {
  static ArrayList<Question> crosswordOne = new ArrayList<Question>();
   

  public static void fillcrosswordOne ()
    {
        crosswordOne.add(new Question("1A ","This country's capital is Santiago ", "Chile" ));
        crosswordOne.add(new Question("2A ","What babies do before they know how to walk ", "Crawl" )); 
        crosswordOne.add(new Question("3A ","What is the name of the smallest country in the world? ", "VATICAN CITY" )); 
        crosswordOne.add(new Question("4A ","What country are the Great Pyramids of Giza located in?  ", "EGYPT"  )); 
        crosswordOne.add(new Question("5A ", "What is the name of the tallest mountain in the world? ", "MOUNT EVEREST"  )); 
       

    }
  static ArrayList<Question> crosswordTwo = new ArrayList<Question>();
  

  public static void fillcrosswordTwo ()
    {
        crosswordTwo.add(new Question( "1D ","This country's capital is Santiago ", "Chile" ));
        crosswordTwo.add(new Question("2D ","What babies do before they know how to walk ", "Crawl" )); 
        crosswordTwo.add(new Question("3D ","What is the name of the smallest country in the world? ", "VATICAN CITY" )); 
        crosswordTwo.add(new Question("4D ","What country are the Great Pyramids of Giza located in?  ", "EGYPT"  )); 
        crosswordTwo.add(new Question("5D ", "What is the name of the tallest mountain in the world? ", "MOUNT EVEREST"  )); 
       

    }


  }