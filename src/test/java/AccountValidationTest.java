import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountValidationTest {
    private final String inputName;
    private final boolean expectedResult;

    public AccountValidationTest(String inputName, boolean expectedResult) {
        this.inputName = inputName;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters(name = "Test {index}: Test with name=\"{0}\"")
    public static Object[][] accountData() {
        return new Object[][]{
                {"Тимоти Шаламе", true},
                {"ТимотиШаламе", false},
                {" Тимоти Шаламе", false},
                {"Тимоти Шаламе ", false},
                {"Ти Ш", true},
                {"Тимоти Шаламеченьдлинноеслово", false},
                {"Тимоти  Шаламе", false}
        };
    }

    @Test
    public void testCheckNameToEmboss() {
        Account account = new Account(inputName);
        assertEquals(expectedResult, account.checkNameToEmboss());
    }
}
