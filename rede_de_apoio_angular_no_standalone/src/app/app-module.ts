import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { Login } from './auth/components/login/login';
import { Signup } from './auth/components/signup/signup';
import { DemoAngularMaterialModule } from './DemoAngularMaterialModule';

@NgModule({
  declarations: [
    App,
    Login,
    Signup
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    DemoAngularMaterialModule
  ],
  providers: [
    provideBrowserGlobalErrorListeners()
  ],
  bootstrap: [App]
})
export class AppModule { }
