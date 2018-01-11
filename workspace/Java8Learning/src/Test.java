import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test{

public static void main(String[] args){

        List<Game> list = Arrays.asList(
                new Game("Dragon Blaze", 5),
                new Game("Angry Bird", 5),
                new Game("Candy Crush", 5)
        );

        //{Dragon Blaze, Angry Bird, Candy Crush}
        String result = list.stream().map(x -> x.getName())
		.collect(Collectors.joining(", ", "{", "}"));
        System.out.println(result);
        
        String str = "Unchanged";
        changeString(str);
        System.out.println(str);

    }

static String changeString(String str)
{
	str.replace(str, "Changed");
	return str;
}

}
    class Game{
        String name;
        int ranking;

        public Game(String name, int ranking) {
            this.name = name;
            this.ranking = ranking;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRanking() {
            return ranking;
        }

        public void setRanking(int ranking) {
            this.ranking = ranking;
        }
    }