import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.AWTException;
import javax.swing.JOptionPane;

public class Bot{

    private Robot bot = new Robot();
    private int browserX = 1004;
    private int browserY = 1058;
    private int click = InputEvent.BUTTON1_DOWN_MASK;
    private int firstSearchBarX = 160;
    private int firstSearchBarY = 50;
    private int secondSearchBarX = 240;
    private int secondSearchBarY = 145;
    private int letter = KeyEvent.VK_A;
    private int enter = KeyEvent.VK_ENTER;
    private String msg = "Finished";

    public Bot() throws AWTException {}

    public void openBrowser() {
        bot.mouseMove(browserX, browserY);
        bot.mousePress(click);
        bot.mouseRelease(click);
        bot.delay(3000);
    }

    public void firstSearchBar() {
        bot.mouseMove(firstSearchBarX, firstSearchBarY);
        typeLetter();
        bot.delay(2000);
    }

    public void secondSearchBar() {
        bot.mouseMove(secondSearchBarX, secondSearchBarY);
    }

    public void fullTypeLetter() {
        for(int i = 0; i < 35; i++) {
            typeLetter();
        }
    }

    private void typeLetter() {
        bot.mousePress(click);
        bot.mouseRelease(click);
        bot.keyPress(letter);
        bot.keyRelease(letter);
        bot.keyPress(enter);
        bot.keyRelease(enter);
        bot.delay(2000);
    }

    public void finish() {
        JOptionPane.showMessageDialog(null, msg);
    }

}
