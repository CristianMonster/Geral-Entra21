import { Component, Input, OnInit } from '@angular/core';
import { Hero } from '../heroes-screen/heroes-screen.component';

@Component({
  selector: 'app-heroes-list-item',
  templateUrl: './heroes-list-item.component.html',
  styleUrls: ['./heroes-list-item.component.css']
})
export class HeroesListItemComponent implements OnInit {

  @Input() hero!: Hero;

  constructor() { }

  ngOnInit(): void {
  }

}
