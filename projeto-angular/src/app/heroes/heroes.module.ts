import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HeroesScreenComponent } from './heroes-screen/heroes-screen.component';
import { HeroesListItemComponent } from './heroes-list-item/heroes-list-item.component';



@NgModule({
  declarations: [
    HeroesScreenComponent,
    HeroesListItemComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    HeroesScreenComponent
  ]
})
export class HeroesModule { }
