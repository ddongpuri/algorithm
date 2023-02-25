select CATEGORY, PRICE AS MAX_PRICE, PRODUCT_NAME from food_product
where (category, price) in 
    ( SELECT category, max(price) as price
    from FOOD_PRODUCT where category in ('과자', '국', '김치', '식용유') group by category) 
order by price desc
