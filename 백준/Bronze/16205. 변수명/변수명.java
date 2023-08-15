import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int _case = Integer.parseInt(st.nextToken());
        String ex = st.nextToken();

        switch (_case){
            case 1:
                String snake=ex;
                System.out.println(ex);
                for(int i = 0 ; i<snake.length(); i++){ //1->2
                    if(snake.toCharArray()[i]<=90&&snake.toCharArray()[i]>=65){
                        snake = snake.substring(0,i)+"_"+(char)(snake.charAt(i)+32)+snake.substring(i+1);
                    }
                }
                System.out.println(snake);
                ex = (char)(ex.charAt(0)-32)+ex.substring(1); //1->3
                System.out.println(ex);
                break;
            case 2:
                String camel = ex;
                for(int i = 0; i<camel.length(); i++){
                    if(camel.toCharArray()[i]=='_'){
                        camel = camel.substring(0,i)+(char)(camel.charAt(i+1)-32)+camel.substring(i+2);
                    }
                }
                System.out.println(camel);
                System.out.println(ex);
                camel = (char)(camel.charAt(0)-32)+camel.substring(1);
                System.out.println(camel);
                break;
            case 3:
                String _camel = ex;
                _camel = (char)(_camel.charAt(0)+32)+_camel.substring(1);
                System.out.println(_camel);
                for(int i = 0 ; i<_camel.length(); i++){ //1->2
                    if(_camel.toCharArray()[i]<=90&&_camel.toCharArray()[i]>=65){
                        _camel = _camel.substring(0,i)+"_"+(char)(_camel.charAt(i)+32)+_camel.substring(i+1);
                    }
                }
                System.out.println(_camel);
                System.out.println(ex);
                break;
        }

    }
}
