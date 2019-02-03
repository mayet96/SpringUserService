package ru.id61890868.SpringUserService.view.person;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class PersonView {


    private Long id;

    @NotNull(message = "name cannot be null")
    @NotEmpty(message = "name cannot be null")
    @Size(max = 50)
    public String firstName;

    @NotNull(message = "name cannot be null")
    @NotEmpty(message = "name cannot be null")
    @Size(max = 50)
    public String secondName;

    @NotNull(message = "name cannot be null")
    public Date birth;

    @NotNull(message = "name cannot be null")
    @NotEmpty(message = "name cannot be null")
    @Size(max = 50)
    public String email;

    @NotNull(message = "name cannot be null")
    @NotEmpty(message = "name cannot be null")
    @Size(max = 50)
    public String password;
}
