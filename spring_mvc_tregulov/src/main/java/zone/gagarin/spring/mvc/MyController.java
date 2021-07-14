package zone.gagarin.spring.mvc;


import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class MyController {

  @RequestMapping("/")
  public String showFirstView() {
    return "first-view";
  }

  @RequestMapping("/askDetails")
  public String askEmployeeDetails(Model model) {
    model.addAttribute("employeeAttr", new Employee());
    return "ask-emp-details-view";
  }

  @RequestMapping("/showDetails")
  public String showEmpDetails(@Valid @ModelAttribute("employeeAttr") Employee emp, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return "ask-emp-details-view";
    } else {
      return "show-emp-details-view";
    }
  }
}
