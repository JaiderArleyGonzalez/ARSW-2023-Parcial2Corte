package edu.eci.arsw.myrestaurant.beans.impl.colombia;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import edu.eci.arsw.myrestaurant.model.RestaurantProduct;
import edu.eci.arsw.myrestaurant.beans.TaxesCalculator;

@Component("StandardTaxesCalculator")
public class StandardTaxesCalculator implements TaxesCalculator {

	@Override
	public float getProductTaxes(RestaurantProduct p) {
		return 0.16f;
	}

}
