import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AttributedirectiveDemoComponent } from './attributedirective-demo.component';

describe('AttributedirectiveDemoComponent', () => {
  let component: AttributedirectiveDemoComponent;
  let fixture: ComponentFixture<AttributedirectiveDemoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AttributedirectiveDemoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AttributedirectiveDemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
