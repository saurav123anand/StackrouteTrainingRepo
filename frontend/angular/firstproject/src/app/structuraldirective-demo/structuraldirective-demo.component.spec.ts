import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StructuraldirectiveDemoComponent } from './structuraldirective-demo.component';

describe('StructuraldirectiveDemoComponent', () => {
  let component: StructuraldirectiveDemoComponent;
  let fixture: ComponentFixture<StructuraldirectiveDemoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StructuraldirectiveDemoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StructuraldirectiveDemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
