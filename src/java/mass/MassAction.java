/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mass;

import temp.*;
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
public class MassAction extends Action {
    
    public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request, HttpServletResponse response){
        MassForm tempForm = (MassForm)form;
        
        double inputVal = tempForm.getInputValue();
        String inputType = tempForm.getInputType();
        String convertType = tempForm.getConvertType();
        
        if(inputType.equals(convertType)){
            tempForm.setAnswer(inputVal);
        }
        else if(inputType.equals("g") && convertType.equals("kg")){
            tempForm.setAnswer(inputVal/1000);
        }
        else if(inputType.equals("kg") && convertType.equals("g")){
            tempForm.setAnswer(inputVal*1000);
        }
        else{
            tempForm.setAnswer(0.00);
        }
        return mapping.findForward("success");
    }
}
