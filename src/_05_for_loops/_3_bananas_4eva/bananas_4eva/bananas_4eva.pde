size(800, 800);
int count = 0;
for ( int y=10; y<800; y+=15) {
  for ( int loop=0; loop<800; loop+=50) {
    text("banana", loop, y);
    count+=1;
  }
}
System.out.println(count);
