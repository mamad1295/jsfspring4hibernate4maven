package com.mamad.jsf.mbean;

import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
 
@ManagedBean
public class BeanValidationView implements Serializable{
     
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Size(min=2,max=5)
    private String name;
     
    @Min(10) @Max(20)
    private Integer age;
     
    @DecimalMax(value= "99.9", message = "Shold not exceed 99.9")
    private Double amount;
     
   
     
    @AssertTrue
    private boolean checked;
 
    @Past
    private Date pastDate;
     
    @Future
    private Date futureDate;
     
    
 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
 
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
 
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
 
    public boolean isChecked() {
        return checked;
    }
    public void setChecked(boolean checked) {
        this.checked = checked;
    }
 
    public Date getPastDate() {
        return pastDate;
    }
    public void setPastDate(Date pastDate) {
        this.pastDate = pastDate;
    }
 
    public Date getFutureDate() {
        return futureDate;
    }
    public void setFutureDate(Date futureDate) {
        this.futureDate = futureDate;
    }
}
 
   