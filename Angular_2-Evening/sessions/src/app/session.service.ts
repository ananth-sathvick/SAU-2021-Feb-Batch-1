import { Injectable } from '@angular/core';
import { Session } from './modal/session';

@Injectable({
  providedIn: 'root'
})
export class SessionService {

  sessions: Session[] = [
    {
      name: 'Angular 2',
      instructor: 'Santhosh Kalisamy',
      description: 'Routing,Reactive forms,material designs',
    },
    {
      name: 'Angular 1',
      instructor: 'Raviteja V',
      description: 'Angular structure,workflow,event binding,property binding',
    },
    {
      name: 'HTML CSS',
      instructor: 'Chandan Chanda',
      description: 'Html css javascript bootstrap',
    },
    {
      name: 'Git',
      instructor: 'Koteswar Rao',
      description: 'Git,github,github,pull,commit,push,merge,pull request',
    },
  ]

  constructor() { }

  getSessions() {
    return this.sessions;
  }

  addSession(session:Session) {
    this.sessions.push(session);
  }

  deleteSession(session:Session){
    const index = this.sessions.indexOf(session);
    this.sessions.splice(index, 1);
  }

  editSession(oldSession:Session,newSession:Session){
    const index = this.sessions.indexOf(oldSession);
    this.sessions[index] = newSession;
  }

  

}
