public class Main {

    public static void main(String[] args) throws Exception {

        Bot bot = new Bot();
        bot.openBrowser();
        bot.firstSearchBar();
        bot.secondSearchBar();
        bot.fullTypeLetter();
        bot.finish();
    }
    
}
