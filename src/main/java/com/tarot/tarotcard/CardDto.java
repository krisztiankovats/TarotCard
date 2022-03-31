package com.tarot.tarotcard;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CardDto  {
    private Integer id;
    private String cardName;
    private String cardDesc;
    private String cardImg;
}
