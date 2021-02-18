import { ComponentFixture, TestBed } from '@angular/core/testing';

import { sessionListComponent } from './session-list.component';

describe('sessionListComponent', () => {
  let component: sessionListComponent;
  let fixture: ComponentFixture<sessionListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ sessionListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(sessionListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
