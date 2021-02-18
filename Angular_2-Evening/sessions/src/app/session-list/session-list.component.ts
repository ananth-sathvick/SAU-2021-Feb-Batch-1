import { Component, OnInit } from '@angular/core';
import { Session } from '../modal/session';
import { SessionService } from '../session.service';

import { MatDialog } from '@angular/material/dialog';
import { AddSessionComponent } from '../add-session/add-session.component';
import { UpdateSessionComponent } from "../update-session/update-session.component"

@Component({
  selector: 'app-session-list',
  templateUrl: './session-list.component.html',
  styleUrls: ['./session-list.component.scss']
})
export class SessionListComponent implements OnInit {

  selectedSession: Session;

  sessions: Session[] = []

  constructor(private sessionService:SessionService, private dialog:MatDialog) { }

  ngOnInit(): void {
    this.sessions = this.sessionService.getSessions();
  }

  updateSelected(session:Session) {
    console.log(session);
    this.selectedSession = session;
  }

  addSession() {
    this.dialog.open(AddSessionComponent);
  }

  deleteSession(session:Session){
    // console.log(session);
    this.sessionService.deleteSession(session);

  }

  editSession(session:Session){
    // console.log(session);
    this.dialog.open(UpdateSessionComponent,{
      data:{
        session:session
      }
    });
  }

}
