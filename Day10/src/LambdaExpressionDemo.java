import java.util.ArrayList;

import java.util.List;

import java.util.stream.Stream;

class ProductId{

  int id;

  String name;

  float price;

  public ProductId(int id, String name, float price) {

    super();

    this.id = id;

    this.name = name;

    this.price = price;

  }

}

public class LambdaExpressionDemo{

  public static void main(String[] args) {

    List<ProductId> list=new ArrayList<ProductId>();

    list.add(new ProductId(1,"Samsung A5",17000f));

    list.add(new ProductId(3,"Iphone 6S",65000f));

    list.add(new ProductId(2,"Sony Xperia",25000f));

    list.add(new ProductId(4,"Nokia Lumia",15000f));

    list.add(new ProductId(5,"Redmi4 ",26000f));

    list.add(new ProductId(6,"Lenevo Vibe",19000f));

    // using lambda to filter data
    System.out.println("greater than 20000");

    Stream<ProductId> filtered_data = list.stream().filter(p -> p.price > 20000);

    // using lambda to iterate through collection

    filtered_data.forEach(

        product -> System.out.println(product.id+" "+product.name+": "+product.price)

    );
    System.out.println("Lesser than 20000");
    Stream<ProductId> filtered_data2 = list.stream().filter(p -> p.price < 20000);

    // using lambda to iterate through collection

    filtered_data2.forEach(

        product -> System.out.println(product.id+" "+product.name+": "+product.price)
        );

  }

}







