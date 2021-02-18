import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { SessionListComponent } from './session-list/session-list.component';
// import { SessionDetailComponent } from './session-detail/session-detail.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import {MatButtonModule} from '@angular/material/button';

import {MatCardModule} from '@angular/material/card';
import { AddSessionComponent } from './add-session/add-session.component';
import { AppRoutingModule } from './app-routing/app-routing.module';

import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';

import {MatDialogModule} from '@angular/material/dialog';
import { UpdateSessionComponent } from './update-session/update-session.component';



@NgModule({
  declarations: [
    AppComponent,
    SessionListComponent,
    // SessionDetailComponent,
    AddSessionComponent,
    UpdateSessionComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatCardModule,
    AppRoutingModule,
    MatFormFieldModule,
    FormsModule, 
    ReactiveFormsModule, 
    MatInputModule,
    MatDialogModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
