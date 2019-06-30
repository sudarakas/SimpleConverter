/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author NanoX
 */
public class TempAction extends Action {
    
    public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request, HttpServletResponse response){
        TempForm tempForm = (TempForm)form;
        
        double inputVal = tempForm.getInputValue();
        String inputType = tempForm.getInputType();
        String convertType = tempForm.getConvertType();
        
        if(inputType.equals(convertType)){
            tempForm.setAnswer(inputVal);
        }
        else if(inputType.equals("C") && convertType.equals("F")){
            tempForm.setAnswer(inputVal * (9/5.0) +32);
        }
        else if(inputType.equals("C") && convertType.equals("K")){
            tempForm.setAnswer(inputVal + 273.15);
        }
        else if(inputType.equals("F") && convertType.equals("C")){
            tempForm.setAnswer((inputVal - 32) * (5/9.0));
        }
        else if(inputType.equals("F") && convertType.equals("K")){
            tempForm.setAnswer((inputVal - 32) * (5/9.0) + 273.15);
        }
        else if(inputType.equals("K") && convertType.equals("C")){
            tempForm.setAnswer(inputVal - 273.15);
        }
        else if(inputType.equals("K") && convertType.equals("F")){
            tempForm.setAnswer((inputVal - 273.15) * (9/5.0) + 32);
        }
        else{
            tempForm.setAnswer(0.00);
        }
        return mapping.findForward("success");
    }
}
