import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Session } from '../modal/session';
import { SessionService } from '../session.service';
import { MatDialogRef } from '@angular/material/dialog';
import { SessionListComponent } from '../session-list/session-list.component';

@Component({
  selector: 'app-add-session',
  templateUrl: './add-session.component.html',
  styleUrls: ['./add-session.component.scss']
})
export class AddSessionComponent implements OnInit {


  sessionForm:FormGroup;
  constructor(private sessionService:SessionService, private dialogRef:MatDialogRef<SessionListComponent>) { }

  ngOnInit(): void {
    this.sessionForm = new FormGroup({
      name : new FormControl('', Validators.required),
      instructor : new FormControl('', Validators.required),
      description : new FormControl('')
    });
  }

  get name() {
    return this.sessionForm.get('name') as FormControl;
  }

  get instructor() {
    return this.sessionForm.get('instructor') as FormControl;
  }

  get description() {
    return this.sessionForm.get('description') as FormControl;
  }

 

  addToList() {
    const session:Session = {
      name : this.name.value,
      instructor : this.instructor.value,
      description : this.description.value
    }
    this.sessionService.addSession(session);
    this.dialogRef.close();
  }

}
