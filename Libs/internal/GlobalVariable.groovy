package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object baseUrl
     
    /**
     * <p></p>
     */
    public static Object petId
     
    /**
     * <p></p>
     */
    public static Object petName
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables('default')
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
    
            baseUrl = selectedVariables['baseUrl']
            petId = selectedVariables['petId']
            petName = selectedVariables['petName']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
