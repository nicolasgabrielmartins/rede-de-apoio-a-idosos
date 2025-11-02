import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-signup',
  standalone: false,
  templateUrl: './signup.html',
  styleUrl: './signup.scss',
})
export class Signup {
    signupForm!: FormGroup;
    hidePassword =true;


    constructor(private fb:FormBuilder){
      this.signupForm =this.fb.group({
        name:[null, [Validators.required]],
        email:[null, [Validators.required, Validators.email]],
        password:[null, [Validators.required]],
        confirmPassword:[null, [Validators.required]],
      })
    }

    togglePasswordVisibility(){
        this.hidePassword =!this.hidePassword;
    }

    onSubmit(){
      console.log(this.signupForm.value);

    }
}
