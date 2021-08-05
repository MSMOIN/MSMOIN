AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);

View dialog1 = getLayoutInflater().inflate(R.layout.loda,null);

alert.setView(dialog1);

final AlertDialog dialog = alert.create ();


dialog.setCanceledOnTouchOutside(false);
dialog.setCancelable(false);


dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

dialog.show();


final EditText entertext = (EditText) dialog1.findViewById(R.id.edittext1);

final Button save = dialog1.findViewById(R.id.button1);

final ImageView img =(ImageView) dialog1.findViewById(R.id.imageview1);

final LinearLayout linear = (LinearLayout) dialog1.findViewById (R.id.linear1);

entertext.setFocusableInTouchMode(true);


entertext.addTextChangedListener(new TextWatcher() {
   @Override
   public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
    final String _charSeq = _param1.toString();
    

   }
   
   @Override
   public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
    
   }
   
   @Override
   public void afterTextChanged(Editable _param1) {
    
   }
  });



save.setOnClickListener(new View.OnClickListener(){


@Override
public void onClick( View dialogmain){
dialog.dismiss();


SavedData = entertext.getText().toString();

}
 
});