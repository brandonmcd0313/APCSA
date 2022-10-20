using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PlayerScript : MonoBehaviour
{
	public float speed = 10f;
	public GameObject Proj;
	// Use this for initialization
	void Start()
	{

	}

	// Update is called once per frame
	void Update()
	{

		//WASD ovement cant go offscreen
		Vector3 pos = Camera.main.WorldToViewportPoint(
			transform.position); //0-1 position in x and y
		if (Input.GetKey(KeyCode.W) && pos.y < 0.96f) //up
		{
			transform.position += new Vector3(0, speed * Time.deltaTime);
		}
		if (Input.GetKey(KeyCode.S) && pos.y > 0.04f) //down
		{
			transform.position -= new Vector3(0, speed * Time.deltaTime);
		}
		if (Input.GetKey(KeyCode.A) && pos.x > 0.04f) //left
		{
			transform.position -= new Vector3(speed * Time.deltaTime, 0);
		}
		if (Input.GetKey(KeyCode.D) && pos.x < 0.96f) //right
		{
			transform.position += new Vector3(speed * Time.deltaTime, 0);
		}

		//rotate towards mouse position
		Vector3 difference = Camera.main.ScreenToWorldPoint(
			Input.mousePosition) - transform.position;
		difference.Normalize();
		float rotation_z = Mathf.Atan2(difference.y,
			difference.x) * Mathf.Rad2Deg;
		transform.rotation = Quaternion.Euler(0, 0,
			rotation_z);

		//spawn on left click
		if (Input.GetMouseButtonDown(0))
		{
			Instantiate(Proj, transform.position,
				Quaternion.identity);
		}


		//raycast in the directon we are facing
		//	 see if we hit anything
		
		if (Physics2D.Raycast(
			transform.position, transform.right, 5))
			{ 
			GameObject hit = Physics2D.Raycast(
				transform.position, transform.right, 5).collider.
				gameObject;
			
				print("Detected" + hit.name);
			//turn the game object red
			hit.GetComponent<SpriteRenderer>().color = Color.red;
		}

	}


}