import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { ProductDetailsComponent } from './product-details/product-details.component';
import { InterpolationDemoComponent } from './interpolation-demo/interpolation-demo.component';
import { PropertybindingDemoComponent } from './propertybinding-demo/propertybinding-demo.component';
import { EventbindingDemoComponent } from './eventbinding-demo/eventbinding-demo.component';
import { TwowaybindingDemoComponent } from './twowaybinding-demo/twowaybinding-demo.component';
import { TemplatevariableDemoComponent } from './templatevariable-demo/templatevariable-demo.component';
import { StructuraldirectiveDemoComponent } from './structuraldirective-demo/structuraldirective-demo.component';
import { AttributedirectiveDemoComponent } from './attributedirective-demo/attributedirective-demo.component'
@NgModule({
  declarations: [
    AppComponent,
    ProductDetailsComponent,
    InterpolationDemoComponent,
    PropertybindingDemoComponent,
    EventbindingDemoComponent,
    TwowaybindingDemoComponent,
    TemplatevariableDemoComponent,
    StructuraldirectiveDemoComponent,
    AttributedirectiveDemoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

/**
 * Important: For Two-Way-Binding (covered in the next lecture) to work, you need to enable the ngModel  directive. This is done by adding the FormsModule  to the imports[]  array in the AppModule.

You then also need to add the import from @angular/forms  in the app.module.ts file:

import { FormsModule } from '@angular/forms'; 
 */
