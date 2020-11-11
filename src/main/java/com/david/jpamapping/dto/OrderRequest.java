package com.david.jpamapping.dto;

import com.david.jpamapping.model.Besucher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {
    public Besucher besucher;

    public Besucher getBesucher() {
        return besucher;
    }

    public void setBesucher(Besucher customer) {
        this.besucher = customer;
    }
}
