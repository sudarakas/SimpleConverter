/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package len;

import temp.*;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author NanoX
 */
public class LenForm extends ActionForm{
    private String inputType;
    private double inputValue;
    private String convertType;
    private double answer;

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public double getInputValue() {
        return inputValue;
    }

    public void setInputValue(double inputValue) {
        this.inputValue = inputValue;
    }

    public String getConvertType() {
        return convertType;
    }

    public void setConvertType(String convertType) {
        this.convertType = convertType;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }
    
    public ActionErrors validate(ActionMapping mapping,HttpServletRequest request){
        ActionErrors errors = new ActionErrors();
        
        return errors;
    }
}
