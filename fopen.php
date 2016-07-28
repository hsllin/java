<?php
$file=fopen("exe1.txt","r") or exit("Unable to open the file");

while(!feof($file))
{
	echo fgets($file)."<br/>";
}
fclose($file);





?>