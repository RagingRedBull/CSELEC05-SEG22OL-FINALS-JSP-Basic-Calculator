<h3 class="text-danger">ERROR</h3>
<% String re =  request.getAttribute("errorMsg").toString(); %>
<p class="text-info"><% out.print(re); %></p>