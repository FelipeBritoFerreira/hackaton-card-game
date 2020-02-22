
package com.hackaton.cardsgame.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Card {
  private String rank;
  private String suit;
}