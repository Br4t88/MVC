<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
       <body>

       <form:form action="hello.htm" method="post" commandName="buyer">
       <div>
         <form:label path="name">Enter new buyer</form:label>
         <form:input path="name" placeholder="buyer name" />

       </div>


         <input type="submit" name="buyer1" value="Save new buyer"/>
         <hr>
         </form:form>
          <form:form action="hello01.htm" method="post" commandName="buyer">

         <div>
                  <form:label path="name">Update buyer</form:label>
                  <form:input path="name" placeholder="buyer name" />
                  <form:label path="buyers_id">Buyer ID</form:label>
                  <form:input path="buyers_id" placeholder="ID" />

                </div>

                  <input type="submit" name="buyer2" value="Update buyer"/>
                  <hr>
                  </form:form>
                            <form:form action="hello02.htm" method="post" commandName="buyer">


       <div>
                <form:label path="buyers_id">Delete buyer with ID</form:label>
                <form:input path="buyers_id" placeholder="ID" />

              </div>

                <input type="submit" name="buyer3" value="Delete buyer"/>
                <hr>
         </form:form>

         <form:form action="hello1.htm" method="post" commandName="product">
                <div>
                  <form:label path="name">Enter new product</form:label>
                  <form:input path="name" placeholder="product name" />

                </div>

                  <input type="submit" name="product1" value="Save new product"/>
                  <hr>
                  </form:form>
                  <form:form action="hello11.htm" method="post" commandName="product">

                  <div>
                           <form:label path="name">Update product</form:label>
                           <form:input path="name" placeholder="product name" />
                           <form:label path="products_id">Product ID</form:label>
                           <form:input path="products_id" placeholder="ID" />

                         </div>

                           <input type="submit" name="product2" value="Update product"/>
                           <hr>
                           </form:form>
                           <form:form action="hello12.htm" method="post" commandName="product">

                <div>
                         <form:label path="products_id">Delete product with ID</form:label>
                         <form:input path="products_id" placeholder="ID" />

                       </div>

                         <input type="submit" name="product3" value="Delete product"/>
                         <hr>
                  </form:form>

              <form:form action="hello2.htm" method="post" commandName="sales">

              <div>
              <form:label path="buyers_id">Buyer with ID</form:label>
              <form:input path="buyers_id" placeholder="ID" />

              <form:label path="products_id">buying product with ID</form:label>
              <form:input path="products_id" placeholder="ID" />

              </div>
              <input type="submit" name="sales" value="Complete sale"/>
               <hr>


              </form:form>

    </body>
</html>
