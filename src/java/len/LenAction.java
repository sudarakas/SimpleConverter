/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package len;

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
public class LenAction extends Action {
    
    public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request, HttpServletResponse response){
        LenForm tempForm = (LenForm)form;
        
        double inputVal = tempForm.getInputValue();
        String inputType = tempForm.getInputType();
        String convertType = tempForm.getConvertType();
        
        if(inputType.equals(convertType)){
            tempForm.setAnswer(inputVal);
        }
        else if(inputType.equals("mm") && convertType.equals("cm")){
            tempForm.setAnswer(inputVal/10.0);
        }
        else if(inputType.equals("mm") && convertType.equals("m")){
            tempForm.setAnswer(inputVal/1000.0);
        }
        else if(inputType.equals("mm") && convertType.equals("km")){
            tempForm.setAnswer(inputVal/1000000);
        }
        else if(inputType.equals("cm") && convertType.equals("mm")){
            tempForm.setAnswer(inputVal * 10);
        }
        else if(inputType.equals("cm") && convertType.equals("m")){
            tempForm.setAnswer(inputVal/100.0);
        }
        else if(inputType.equals("cm") && convertType.equals("km")){
            tempForm.setAnswer(inputVal/10000);
        }
        else if(inputType.equals("m") && convertType.equals("mm")){
            tempForm.setAnswer(inputVal*1000);
        }
        else if(inputType.equals("m") && convertType.equals("cm")){
            tempForm.setAnswer(inputVal*100);
        }
        else if(inputType.equals("m") && convertType.equals("km")){
            tempForm.setAnswer(inputVal/1000);
        }
        else if(inputType.equals("km") && convertType.equals("mm")){
            tempForm.setAnswer(inputVal*100000);
        }
        else if(inputType.equals("km") && convertType.equals("cm")){
            tempForm.setAnswer(inputVal*10000);
        }
        else if(inputType.equals("km") && convertType.equals("m")){
            tempForm.setAnswer(inputVal*1000);
        }
        else{
            tempForm.setAnswer(0.00);
        }
        return mapping.findForward("success");
    }
}
